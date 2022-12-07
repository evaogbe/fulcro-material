(ns ogbe.fulcro.mui.icons.fireplace-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FireplaceSharp" :default FireplaceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fireplace-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FireplaceSharp)))