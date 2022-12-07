(ns ogbe.fulcro.mui.icons.rsvp-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/RsvpTwoTone" :default RsvpTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rsvp-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RsvpTwoTone)))