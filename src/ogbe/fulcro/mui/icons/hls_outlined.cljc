(ns ogbe.fulcro.mui.icons.hls-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HlsOutlined" :default HlsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hls-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HlsOutlined)))