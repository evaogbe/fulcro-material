(ns ogbe.fulcro.mui.icons.arrow-left-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ArrowLeftSharp" :default ArrowLeftSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-left-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowLeftSharp)))