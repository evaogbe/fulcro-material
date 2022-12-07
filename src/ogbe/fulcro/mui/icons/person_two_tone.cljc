(ns ogbe.fulcro.mui.icons.person-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PersonTwoTone" :default PersonTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonTwoTone)))