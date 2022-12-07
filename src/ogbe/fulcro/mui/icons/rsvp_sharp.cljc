(ns ogbe.fulcro.mui.icons.rsvp-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RsvpSharp" :default RsvpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rsvp-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RsvpSharp)))