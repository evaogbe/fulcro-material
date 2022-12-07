(ns ogbe.fulcro.mui.icons.timer
  #?(:cljs (:require
            ["@mui/icons-material/Timer" :default Timer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Timer)))