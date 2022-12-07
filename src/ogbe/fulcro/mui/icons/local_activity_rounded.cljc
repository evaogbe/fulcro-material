(ns ogbe.fulcro.mui.icons.local-activity-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LocalActivityRounded" :default LocalActivityRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-activity-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalActivityRounded)))