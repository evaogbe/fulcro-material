(ns ogbe.fulcro.mui.icons.people-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PeopleTwoTone" :default PeopleTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-people-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PeopleTwoTone)))