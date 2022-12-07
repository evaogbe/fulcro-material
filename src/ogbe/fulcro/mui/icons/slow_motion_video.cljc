(ns ogbe.fulcro.mui.icons.slow-motion-video
  #?(:cljs (:require
            ["@mui/icons-material/SlowMotionVideo" :default SlowMotionVideo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-slow-motion-video
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SlowMotionVideo)))