(ns ogbe.fulcro.mui.icons.pause-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PauseTwoTone" :default PauseTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PauseTwoTone)))