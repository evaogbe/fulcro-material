(ns ogbe.fulcro.mui.icons.outbox-sharp
  #?(:cljs (:require
            ["@mui/icons-material/OutboxSharp" :default OutboxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbox-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboxSharp)))