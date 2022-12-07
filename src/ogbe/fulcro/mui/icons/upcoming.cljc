(ns ogbe.fulcro.mui.icons.upcoming
  #?(:cljs (:require
            ["@mui/icons-material/Upcoming" :default Upcoming]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upcoming
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Upcoming)))