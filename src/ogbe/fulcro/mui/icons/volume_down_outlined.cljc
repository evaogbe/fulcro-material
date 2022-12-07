(ns ogbe.fulcro.mui.icons.volume-down-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VolumeDownOutlined" :default VolumeDownOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-down-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeDownOutlined)))