(ns ogbe.fulcro.mui.icons.launch-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LaunchRounded" :default LaunchRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-launch-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LaunchRounded)))