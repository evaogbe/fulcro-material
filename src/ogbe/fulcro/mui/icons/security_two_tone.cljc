(ns ogbe.fulcro.mui.icons.security-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SecurityTwoTone" :default SecurityTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-security-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SecurityTwoTone)))