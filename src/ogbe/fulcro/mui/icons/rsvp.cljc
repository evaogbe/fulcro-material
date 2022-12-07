(ns ogbe.fulcro.mui.icons.rsvp
  #?(:cljs (:require
            ["@mui/icons-material/Rsvp" :default Rsvp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rsvp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rsvp)))