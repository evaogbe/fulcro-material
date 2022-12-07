(ns ogbe.fulcro.mui.icons.outbox
  #?(:cljs (:require
            ["@mui/icons-material/Outbox" :default Outbox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbox
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Outbox)))