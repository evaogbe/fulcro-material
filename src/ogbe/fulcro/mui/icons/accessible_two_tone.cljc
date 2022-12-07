(ns ogbe.fulcro.mui.icons.accessible-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AccessibleTwoTone" :default AccessibleTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessible-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibleTwoTone)))