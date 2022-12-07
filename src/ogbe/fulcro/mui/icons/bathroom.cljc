(ns ogbe.fulcro.mui.icons.bathroom
  #?(:cljs (:require
            ["@mui/icons-material/Bathroom" :default Bathroom]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bathroom
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bathroom)))