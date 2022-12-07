(ns ogbe.fulcro.mui.icons.launch-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LaunchOutlined" :default LaunchOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-launch-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaunchOutlined)))