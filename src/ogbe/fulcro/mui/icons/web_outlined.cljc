(ns ogbe.fulcro.mui.icons.web-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WebOutlined" :default WebOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebOutlined)))