(ns ogbe.fulcro.mui.icons.style-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StyleSharp" :default StyleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-style-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StyleSharp)))