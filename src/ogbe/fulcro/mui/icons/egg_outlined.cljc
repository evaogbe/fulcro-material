(ns ogbe.fulcro.mui.icons.egg-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EggOutlined" :default EggOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-egg-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EggOutlined)))