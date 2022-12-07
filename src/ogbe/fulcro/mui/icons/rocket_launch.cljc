(ns ogbe.fulcro.mui.icons.rocket-launch
  #?(:cljs (:require
            ["@mui/icons-material/RocketLaunch" :default RocketLaunch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rocket-launch
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RocketLaunch)))