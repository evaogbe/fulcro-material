(ns ogbe.fulcro.mui.icons.cake-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CakeSharp" :default CakeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cake-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CakeSharp)))