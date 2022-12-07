(ns ogbe.fulcro.mui.icons.timelapse-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TimelapseSharp" :default TimelapseSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timelapse-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimelapseSharp)))