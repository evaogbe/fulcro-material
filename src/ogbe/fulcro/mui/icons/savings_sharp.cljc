(ns ogbe.fulcro.mui.icons.savings-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SavingsSharp" :default SavingsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-savings-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SavingsSharp)))