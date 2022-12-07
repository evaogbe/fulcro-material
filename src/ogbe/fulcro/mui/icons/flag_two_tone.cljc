(ns ogbe.fulcro.mui.icons.flag-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FlagTwoTone" :default FlagTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flag-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlagTwoTone)))