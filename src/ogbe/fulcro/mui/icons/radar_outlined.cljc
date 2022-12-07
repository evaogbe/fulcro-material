(ns ogbe.fulcro.mui.icons.radar-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RadarOutlined" :default RadarOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radar-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadarOutlined)))