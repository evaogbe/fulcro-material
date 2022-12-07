(ns ogbe.fulcro.mui.icons.timelapse
  #?(:cljs (:require
            ["@mui/icons-material/Timelapse" :default Timelapse]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timelapse
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Timelapse)))