(ns ogbe.fulcro.mui.icons.sms-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SmsTwoTone" :default SmsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sms-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmsTwoTone)))