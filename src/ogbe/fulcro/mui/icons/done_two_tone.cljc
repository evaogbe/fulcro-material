(ns ogbe.fulcro.mui.icons.done-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DoneTwoTone" :default DoneTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneTwoTone)))