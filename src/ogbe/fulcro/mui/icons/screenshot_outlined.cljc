(ns ogbe.fulcro.mui.icons.screenshot-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ScreenshotOutlined" :default ScreenshotOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screenshot-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenshotOutlined)))