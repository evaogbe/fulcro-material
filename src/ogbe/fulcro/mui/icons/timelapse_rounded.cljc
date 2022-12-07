(ns ogbe.fulcro.mui.icons.timelapse-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TimelapseRounded" :default TimelapseRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timelapse-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimelapseRounded)))