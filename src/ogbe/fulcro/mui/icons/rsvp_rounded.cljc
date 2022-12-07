(ns ogbe.fulcro.mui.icons.rsvp-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RsvpRounded" :default RsvpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rsvp-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RsvpRounded)))