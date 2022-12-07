(ns ogbe.fulcro.mui.icons.badge-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BadgeTwoTone" :default BadgeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-badge-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BadgeTwoTone)))