(ns ogbe.fulcro.mui.icons.call-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CallTwoTone" :default CallTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallTwoTone)))