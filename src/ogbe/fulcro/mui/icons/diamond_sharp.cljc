(ns ogbe.fulcro.mui.icons.diamond-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DiamondSharp" :default DiamondSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-diamond-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DiamondSharp)))