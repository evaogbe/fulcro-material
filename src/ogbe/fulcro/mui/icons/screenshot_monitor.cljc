(ns ogbe.fulcro.mui.icons.screenshot-monitor
  #?(:cljs (:require
            ["@mui/icons-material/ScreenshotMonitor" :default ScreenshotMonitor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screenshot-monitor
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenshotMonitor)))