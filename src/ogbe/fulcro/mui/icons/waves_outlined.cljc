(ns ogbe.fulcro.mui.icons.waves-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WavesOutlined" :default WavesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-waves-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WavesOutlined)))