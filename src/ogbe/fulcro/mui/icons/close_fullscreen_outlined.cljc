(ns ogbe.fulcro.mui.icons.close-fullscreen-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CloseFullscreenOutlined" :default CloseFullscreenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-fullscreen-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseFullscreenOutlined)))