(ns ogbe.fulcro.mui.icons.clear-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ClearTwoTone" :default ClearTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearTwoTone)))