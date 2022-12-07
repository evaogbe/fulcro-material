(ns ogbe.fulcro.mui.icons.redeem
  #?(:cljs (:require
            ["@mui/icons-material/Redeem" :default Redeem]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redeem
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Redeem)))