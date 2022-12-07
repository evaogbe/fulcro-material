(ns ogbe.fulcro.mui.icons.pages-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PagesSharp" :default PagesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pages-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PagesSharp)))