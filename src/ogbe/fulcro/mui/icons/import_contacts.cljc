(ns ogbe.fulcro.mui.icons.import-contacts
  #?(:cljs (:require
            ["@mui/icons-material/ImportContacts" :default ImportContacts]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-import-contacts
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImportContacts)))