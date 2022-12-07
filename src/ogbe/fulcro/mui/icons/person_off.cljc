(ns ogbe.fulcro.mui.icons.person-off
  #?(:cljs (:require
            ["@mui/icons-material/PersonOff" :default PersonOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonOff)))