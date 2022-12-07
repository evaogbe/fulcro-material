(ns ogbe.fulcro.mui.icons.lock-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LockTwoTone" :default LockTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockTwoTone)))