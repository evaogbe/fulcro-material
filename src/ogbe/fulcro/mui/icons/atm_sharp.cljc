(ns ogbe.fulcro.mui.icons.atm-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AtmSharp" :default AtmSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-atm-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AtmSharp)))