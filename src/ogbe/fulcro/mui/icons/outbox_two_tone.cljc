(ns ogbe.fulcro.mui.icons.outbox-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/OutboxTwoTone" :default OutboxTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbox-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboxTwoTone)))