(ns ogbe.fulcro.mui.icons.time-to-leave
  #?(:cljs (:require
            ["@mui/icons-material/TimeToLeave" :default TimeToLeave]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-time-to-leave
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimeToLeave)))