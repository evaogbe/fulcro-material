(ns ogbe.fulcro.mui.icons.rsvp-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RsvpOutlined" :default RsvpOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rsvp-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RsvpOutlined)))