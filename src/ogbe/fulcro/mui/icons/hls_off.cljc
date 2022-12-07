(ns ogbe.fulcro.mui.icons.hls-off
  #?(:cljs (:require
            ["@mui/icons-material/HlsOff" :default HlsOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hls-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HlsOff)))