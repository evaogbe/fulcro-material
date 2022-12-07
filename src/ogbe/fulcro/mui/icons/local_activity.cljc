(ns ogbe.fulcro.mui.icons.local-activity
  #?(:cljs (:require
            ["@mui/icons-material/LocalActivity" :default LocalActivity]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-activity
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalActivity)))