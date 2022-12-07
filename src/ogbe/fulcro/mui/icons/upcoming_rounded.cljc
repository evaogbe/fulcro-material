(ns ogbe.fulcro.mui.icons.upcoming-rounded
  #?(:cljs (:require
            ["@mui/icons-material/UpcomingRounded" :default UpcomingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upcoming-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UpcomingRounded)))